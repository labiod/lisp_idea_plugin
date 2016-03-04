package com.kgb.lisp;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.LispFileTypFactory
 */
public class LispFileTypFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(LispFileType.INSTANCE, LispConstant.LANG_DEFAULT_EXTENSION);
    }
}
