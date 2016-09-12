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

public class LispSpecialFormImpl extends ASTWrapperPsiElement implements LispSpecialForm {

  public LispSpecialFormImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitSpecialForm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LispBaseFunctionForm getBaseFunctionForm() {
    return findChildByClass(LispBaseFunctionForm.class);
  }

  @Override
  @Nullable
  public LispDefvarBlock getDefvarBlock() {
    return findChildByClass(LispDefvarBlock.class);
  }

  @Override
  @Nullable
  public LispDolistBlock getDolistBlock() {
    return findChildByClass(LispDolistBlock.class);
  }

  @Override
  @Nullable
  public LispGetfBlock getGetfBlock() {
    return findChildByClass(LispGetfBlock.class);
  }

  @Override
  @Nullable
  public LispLetBlock getLetBlock() {
    return findChildByClass(LispLetBlock.class);
  }

  @Override
  @Nullable
  public LispListBlock getListBlock() {
    return findChildByClass(LispListBlock.class);
  }

  @Override
  @Nullable
  public LispLoadBlock getLoadBlock() {
    return findChildByClass(LispLoadBlock.class);
  }

  @Override
  @Nullable
  public LispLoopBlock getLoopBlock() {
    return findChildByClass(LispLoopBlock.class);
  }

  @Override
  @Nullable
  public LispPushBlock getPushBlock() {
    return findChildByClass(LispPushBlock.class);
  }

  @Override
  @Nullable
  public LispSetqBlock getSetqBlock() {
    return findChildByClass(LispSetqBlock.class);
  }

}
