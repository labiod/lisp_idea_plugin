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

public class LispLoopForBlockImpl extends ASTWrapperPsiElement implements LispLoopForBlock {

  public LispLoopForBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitLoopForBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LispLoopForFromBlock getLoopForFromBlock() {
    return findChildByClass(LispLoopForFromBlock.class);
  }

  @Override
  @Nullable
  public LispLoopForInBlock getLoopForInBlock() {
    return findChildByClass(LispLoopForInBlock.class);
  }

  @Override
  @NotNull
  public LispVar getVar() {
    return findNotNullChildByClass(LispVar.class);
  }

}
