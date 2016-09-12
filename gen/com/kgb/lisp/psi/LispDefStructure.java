// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispDefStructure extends PsiElement {

  @Nullable
  LispDocumentation getDocumentation();

  @NotNull
  List<LispSlotDescription> getSlotDescriptionList();

  @NotNull
  LispStructNameAndOptions getStructNameAndOptions();

}
