// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispBasicType extends PsiElement {

  @Nullable
  LispBooleanValue getBooleanValue();

  @Nullable
  LispListDef getListDef();

  @Nullable
  LispStringValue getStringValue();

  @Nullable
  PsiElement getHashSymbol();

  @Nullable
  PsiElement getNumber();

  @Nullable
  PsiElement getString();

}
