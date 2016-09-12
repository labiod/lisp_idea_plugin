// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispBlockBody extends PsiElement {

  @Nullable
  LispBasicType getBasicType();

  @Nullable
  LispCallFunc getCallFunc();

  @Nullable
  LispDefStructure getDefStructure();

  @Nullable
  LispDefunBlock getDefunBlock();

  @Nullable
  LispEmptyBlock getEmptyBlock();

  @Nullable
  LispIfForm getIfForm();

  @Nullable
  LispMakeDef getMakeDef();

  @Nullable
  LispSpecialForm getSpecialForm();

  @Nullable
  PsiElement getSymbol();

}
