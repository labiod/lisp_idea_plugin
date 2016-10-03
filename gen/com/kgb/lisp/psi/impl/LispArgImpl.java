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

public class LispArgImpl extends ASTWrapperPsiElement implements LispArg {

  public LispArgImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitArg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LispBasicType getBasicType() {
    return findChildByClass(LispBasicType.class);
  }

  @Override
  @Nullable
  public LispCallFunc getCallFunc() {
    return findChildByClass(LispCallFunc.class);
  }

  @Override
  @Nullable
  public LispMakeDef getMakeDef() {
    return findChildByClass(LispMakeDef.class);
  }

  @Override
  @Nullable
  public LispSpecialForm getSpecialForm() {
    return findChildByClass(LispSpecialForm.class);
  }

  @Override
  @Nullable
  public LispStringValue getStringValue() {
    return findChildByClass(LispStringValue.class);
  }

  @Override
  @Nullable
  public LispVar getVar() {
    return findChildByClass(LispVar.class);
  }

  @Override
  @Nullable
  public PsiElement getHashSymbol() {
    return findChildByType(HASH_SYMBOL);
  }

  @Override
  @Nullable
  public PsiElement getObjectField() {
    return findChildByType(OBJECT_FIELD);
  }

}
