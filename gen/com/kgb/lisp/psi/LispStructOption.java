// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispStructOption extends PsiElement {

  @NotNull
  List<LispBaseFunction> getBaseFunctionList();

  @Nullable
  LispBlockBody getBlockBody();

  @NotNull
  List<LispCallFunc> getCallFuncList();

  @NotNull
  List<LispDeclaration> getDeclarationList();

  @Nullable
  LispDocumentation getDocumentation();

  @NotNull
  List<LispSlotDescription> getSlotDescriptionList();

  @NotNull
  List<LispSlotName> getSlotNameList();

  @NotNull
  List<LispStringValue> getStringValueList();

  @NotNull
  List<LispVar> getVarList();

  @Nullable
  PsiElement getNumber();

  @Nullable
  PsiElement getSymbol();

}
