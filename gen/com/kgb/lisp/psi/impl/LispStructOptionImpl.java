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

public class LispStructOptionImpl extends ASTWrapperPsiElement implements LispStructOption {

  public LispStructOptionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitStructOption(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LispBaseFunction> getBaseFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispBaseFunction.class);
  }

  @Override
  @Nullable
  public LispBlockBody getBlockBody() {
    return findChildByClass(LispBlockBody.class);
  }

  @Override
  @NotNull
  public List<LispCallFunc> getCallFuncList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispCallFunc.class);
  }

  @Override
  @NotNull
  public List<LispDeclaration> getDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispDeclaration.class);
  }

  @Override
  @Nullable
  public LispDocumentation getDocumentation() {
    return findChildByClass(LispDocumentation.class);
  }

  @Override
  @NotNull
  public List<LispSlotDescription> getSlotDescriptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispSlotDescription.class);
  }

  @Override
  @NotNull
  public List<LispSlotName> getSlotNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispSlotName.class);
  }

  @Override
  @NotNull
  public List<LispStringValue> getStringValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispStringValue.class);
  }

  @Override
  @NotNull
  public List<LispVar> getVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LispVar.class);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getSymbol() {
    return findChildByType(SYMBOL);
  }

}
