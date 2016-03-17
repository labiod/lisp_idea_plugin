package com.kgb.lisp.settings;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.kgb.lisp.LispConstant;
import com.kgb.lisp.codestyle.LispSyntaxHighlighter;
import com.kgb.lisp.icons.LispIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.settings.LispColorSettingsPage
 */
public class LispColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
            new AttributesDescriptor("Keywords", LispSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Function attributes", LispSyntaxHighlighter.ATTRIBUTE),
            new AttributesDescriptor("String", LispSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", LispSyntaxHighlighter.INTEGER),
            new AttributesDescriptor("Value", LispSyntaxHighlighter.VALUE),
    };
    @Nullable
    @Override
    public Icon getIcon() {
        return LispIcons.ICON;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new LispSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return ";This is sample lisp file \n" +
                "(let ((local-value 0))) \n" +
                "(setq int-global-value 1 ) \n" +
                "(setq null-global-value nil) \n" +
                ";multi set global value \n" +
                "(setq a 1 b 2 c 3) ; a => 1 b => 2 c => 3 \n" +
                ";update global value \n" +
                "(setq a (+ 1 b) b (+ 1 a) c (+ a b) ; a => 3, b => 2 c => 5";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return LispConstant.LANG_ID;
    }
}
