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

public class LispBasicTypeImpl extends ASTWrapperPsiElement implements LispBasicType {

  public LispBasicTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitBasicType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LispBooleanValue getBooleanValue() {
    return findChildByClass(LispBooleanValue.class);
  }

  @Override
  @Nullable
  public LispListDef getListDef() {
    return findChildByClass(LispListDef.class);
  }

  @Override
  @Nullable
  public LispStringValue getStringValue() {
    return findChildByClass(LispStringValue.class);
  }

  @Override
  @Nullable
  public PsiElement getHashSymbol() {
    return findChildByType(HASH_SYMBOL);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
