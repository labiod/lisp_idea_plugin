package com.kgb.lisp.linemarkers;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.icons.LispIcons;
import com.kgb.lisp.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.providers.LineMarkerProvider
 */
public class LineMarkerProvider extends RelatedItemLineMarkerProvider {

    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, Collection<? super RelatedItemLineMarkerInfo> result) {
        if(element instanceof LispCallFunc) {
            LispCallFunc callFunc = (LispCallFunc) element;
            List<LispArg> args = callFunc.getArgList();
            for(LispArg arg : args) {
                if(arg.getVar() != null) {
                    String value = arg.getVar().getText();
                    if (value != null) {
                        Project project = element.getProject();
                        if (value.trim().length() == 0) {
                            return;
                        }
                        String key = value.trim();
                        List<LispSetqBlock> properties = LispUtil.findProperties(project, key);
                        if (properties.size() > 0) {
                            NavigationGutterIconBuilder<PsiElement> builder = NavigationGutterIconBuilder
                                    .create(LispIcons.PROPERTY_ICON)
                                    .setTargets(properties)
                                    .setTooltipText("Navigate to property");
                            result.add(builder.createLineMarkerInfo(arg));
                        }
                    }
                }
            }
            LispFuncName funcName = ((LispCallFunc) element).getFuncName();
            List<LispDefunBlock> functions = LispUtil.findDefFunctions(element.getProject(), funcName.getText());
            if(functions.size() > 0) {
                NavigationGutterIconBuilder<PsiElement> builder = NavigationGutterIconBuilder
                        .create(LispIcons.FUNCTION_ICON)
                        .setTargets(functions)
                        .setTooltipText("Navigate to function declaration");
                result.add(builder.createLineMarkerInfo(funcName));
            }
        }
    }
}
