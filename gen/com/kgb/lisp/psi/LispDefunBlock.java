// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispDefunBlock extends PsiElement {

  @NotNull
  List<LispDefunVar> getDefunVarList();

  @Nullable
  LispDocumentation getDocumentation();

  @NotNull
  List<LispFormBody> getFormBodyList();

  @NotNull
  LispFuncName getFuncName();

  String getFunctionName();

  int getArgumentCount();

}
