// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LispSpecialForm extends PsiElement {

  @Nullable
  LispBaseFunctionForm getBaseFunctionForm();

  @Nullable
  LispDefvarBlock getDefvarBlock();

  @Nullable
  LispDolistBlock getDolistBlock();

  @Nullable
  LispGetfBlock getGetfBlock();

  @Nullable
  LispLetBlock getLetBlock();

  @Nullable
  LispListBlock getListBlock();

  @Nullable
  LispLoadBlock getLoadBlock();

  @Nullable
  LispLoopBlock getLoopBlock();

  @Nullable
  LispPushBlock getPushBlock();

  @Nullable
  LispSetqBlock getSetqBlock();

}
