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

public class LispDefStructureImpl extends ASTWrapperPsiElement implements LispDefStructure {

  public LispDefStructureImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LispVisitor visitor) {
    visitor.visitDefStructure(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LispVisitor) accept((LispVisitor)visitor);
    else super.accept(visitor);
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
  public LispStructNameAndOptions getStructNameAndOptions() {
    return findNotNullChildByClass(LispStructNameAndOptions.class);
  }

}
