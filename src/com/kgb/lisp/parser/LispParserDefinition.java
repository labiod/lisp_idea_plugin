package com.kgb.lisp.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.kgb.lisp.LispLanguage;
import com.kgb.lisp.lexer.LispLexerAdapter;
import com.kgb.lisp.psi.LispFile;
import com.kgb.lisp.psi.LispTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.parser.LispParserDefinition
 */
public class LispParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACE = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(LispTypes.COMMENT);

    private static final IFileElementType FILE = new IFileElementType(Language.<LispLanguage>findInstance(LispLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new LispLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new LispParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new LispFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return LispTypes.Factory.createElement(node);
    }
}
