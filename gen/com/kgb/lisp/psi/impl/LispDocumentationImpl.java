// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kgb.lisp.psi.LispTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kgb.lisp.psi.*;

public class LispDocumentationImpl extends ASTWrapperPsiElement implements LispDocumentation {

  public LispDocumentationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitDocumentation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getString() {
    return findNotNullChildByType(STRING);
  }

}