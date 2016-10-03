// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispSlotDescription extends PsiElement {

  @NotNull
  List<LispArg> getArgList();

  @NotNull
  LispSlotName getSlotName();

  @NotNull
  List<LispSlotOption> getSlotOptionList();

}
