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

public class LispDefunBlockImpl extends ASTWrapperPsiElement implements LispDefunBlock {

  public LispDefunBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitDefunBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LispDefunVar> getDefunVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispDefunVar.class);
  }

  @Override
  @Nullable
  public LispDocumentation getDocumentation() {
    return findChildByClass(LispDocumentation.class);
  }

  @Override
  @NotNull
  public List<LispFormBody> getFormBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispFormBody.class);
  }

  @Override
  @NotNull
  public LispFuncName getFuncName() {
    return findNotNullChildByClass(LispFuncName.class);
  }

  public String getFunctionName() {
    return LispPsiImplUtil.getFunctionName(this);
  }

  public int getArgumentCount() {
    return LispPsiImplUtil.getArgumentCount(this);
  }

}
