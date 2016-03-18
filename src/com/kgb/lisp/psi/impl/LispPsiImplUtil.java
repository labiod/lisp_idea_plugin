package com.kgb.lisp.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.roots.libraries.LibraryProperties;
import com.intellij.psi.PsiElement;
import com.kgb.lisp.psi.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.impl.LispPsiImplUtil
 */
public class LispPsiImplUtil {

    public static String getFunctionName(LispDefFun element) {
        LispFuncName functionName = element.getFuncName();
        return functionName.getText().replaceAll("\\\\ ", " ");
    }

    public static int getArgumentCount(LispDefFun element) {
        return element.getDefVarList().size();
    }

    public static List<String> getProperties(LispSetqBlock element) {
        List<LispSetqArgs> args = element.getSetqArgsList();
        List<String> result = new ArrayList<String>();
        for (LispSetqArgs arg : args) {
            result.add(arg.getVar().getText());
        }
        return result;
    }

    public static PsiElement getNameIdentifier(LispFuncName element) {
        ASTNode keyNode = element.getNode().findChildByType(LispTypes.FUNC_NAME);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }
}
