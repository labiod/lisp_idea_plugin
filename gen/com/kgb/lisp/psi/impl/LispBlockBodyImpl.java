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

public class LispBlockBodyImpl extends ASTWrapperPsiElement implements LispBlockBody {

  public LispBlockBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitBlockBody(this);
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
  public LispDefStructure getDefStructure() {
    return findChildByClass(LispDefStructure.class);
  }

  @Override
  @Nullable
  public LispDefunBlock getDefunBlock() {
    return findChildByClass(LispDefunBlock.class);
  }

  @Override
  @Nullable
  public LispEmptyBlock getEmptyBlock() {
    return findChildByClass(LispEmptyBlock.class);
  }

  @Override
  @Nullable
  public LispIfForm getIfForm() {
    return findChildByClass(LispIfForm.class);
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
  public PsiElement getSymbol() {
    return findChildByType(SYMBOL);
  }

}
