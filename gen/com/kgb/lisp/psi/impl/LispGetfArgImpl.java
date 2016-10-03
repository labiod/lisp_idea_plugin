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

public class LispGetfArgImpl extends ASTWrapperPsiElement implements LispGetfArg {

  public LispGetfArgImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitGetfArg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LispCallFunc getCallFunc() {
    return findChildByClass(LispCallFunc.class);
  }

  @Override
  @Nullable
  public LispListDef getListDef() {
    return findChildByClass(LispListDef.class);
  }

  @Override
  @Nullable
  public LispSpecialForm getSpecialForm() {
    return findChildByClass(LispSpecialForm.class);
  }

  @Override
  @Nullable
  public PsiElement getObjectField() {
    return findChildByType(OBJECT_FIELD);
  }

  @Override
  @Nullable
  public PsiElement getSymbol() {
    return findChildByType(SYMBOL);
  }

}
