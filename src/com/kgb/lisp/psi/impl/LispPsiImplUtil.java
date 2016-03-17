package com.kgb.lisp.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.roots.libraries.LibraryProperties;
import com.intellij.psi.PsiElement;
import com.kgb.lisp.psi.*;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.impl.LispPsiImplUtil
 */
public class LispPsiImplUtil {
    public static String getFunctionName(LispDefFunItem element) {
        ASTNode functionName = element.getNode().findChildByType(LispTypes.FUNC_NAME);
        if(functionName != null) {
            return functionName.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getProperty(LispSetqBlock element) {
        ASTNode property = element.getNode().findChildByType(LispTypes.VAR_NAM);
        if(property != null) {
            return property.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
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
