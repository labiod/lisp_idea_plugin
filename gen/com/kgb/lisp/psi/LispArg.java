// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispArg extends PsiElement {

  @Nullable
  LispBasicType getBasicType();

  @Nullable
  LispCallFunc getCallFunc();

  @Nullable
  LispMakeDef getMakeDef();

  @Nullable
  LispSpecialForm getSpecialForm();

  @Nullable
  LispStringValue getStringValue();

  @Nullable
  LispVar getVar();

  @Nullable
  PsiElement getHashSymbol();

  @Nullable
  PsiElement getObjectField();

}
