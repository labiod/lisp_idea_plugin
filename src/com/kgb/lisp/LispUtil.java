package com.kgb.lisp;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.kgb.lisp.psi.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.LispUtil
 */
public class LispUtil {
    public static List<LispDefunBlock> findDefFunctions(Project project, String key) {
        List<LispDefunBlock> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME,
                LispFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispBlockBody[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
                if(defFunctions != null) {
                    for(LispBlockBody block : defFunctions) {
                        ASTNode node = block.getNode().findChildByType(LispTypes.DEFUN_BLOCK);
                        if(node != null) {
                            LispDefunBlock item = (LispDefunBlock) node.getPsi();
                            if (key.equals(item.getFunctionName())) {
                                if (result == null) {
                                    result = new ArrayList<LispDefunBlock>();
                                }
                                result.add(item);
                            }
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<LispDefunBlock>emptyList();
    }

    public static List<LispDefunBlock> findDefFunctions(Project project) {
        List<LispDefunBlock> result = new ArrayList<LispDefunBlock>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, LispFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispBlockBody[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
                if(defFunctions != null) {
                    for(LispBlockBody block : defFunctions) {
                        ASTNode node = block.getNode().findChildByType(LispTypes.DEFUN_BLOCK);
                        if(node != null) {
                            LispDefunBlock item = (LispDefunBlock) node.getPsi();
                            result.add(item);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<LispDefStructure> findDefStructures(Project project) {
        List<LispDefStructure> result = new ArrayList<LispDefStructure>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, LispFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispBlockBody[] defBlocks = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
                if(defBlocks != null) {
                    for(LispBlockBody block : defBlocks) {
                        LispDefStructure defStructure = block.getDefStructure();
                        if(defStructure != null) {
                            result.add(defStructure);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<LispDefStructure> findDefStructures(Project project, String key) {
        List<LispDefStructure> result = new ArrayList<LispDefStructure>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, LispFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispBlockBody[] defBlocks = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
                if(defBlocks != null) {
                    for(LispBlockBody block : defBlocks) {
                        LispDefStructure defStructure = block.getDefStructure();
                        if(defStructure != null && key.equals(defStructure.getStructNameAndOptions().getStructName().getText())) {
                            result.add(defStructure);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<LispSetqBlock> findProperties(Project project, String key) {
        List<LispSetqBlock> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME,
                LispFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispBlockBody[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
                if(defFunctions != null) {
                    for(LispBlockBody block : defFunctions) {
                        if(block.getSpecialForm() != null) {
                            LispSetqBlock item = block.getSpecialForm().getSetqBlock();
                            if(item != null) {
                                List<String> properties = item.getProperties();
                                for(String property : properties) {
                                    if (key.equals(property)) {
                                        if (result == null) {
                                            result = new ArrayList<LispSetqBlock>();
                                        }
                                        result.add(item);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<LispSetqBlock>emptyList();
    }

    public static List<String> getBaseMethodName() {
        List<String> baseMethod = new ArrayList<String>();
        baseMethod.add("defun");
        baseMethod.add("defvar");
        baseMethod.add("defstruct");
        baseMethod.add("if");
        baseMethod.add("car");
        baseMethod.add("cdr");
        baseMethod.add("loop");
        baseMethod.add("cons");
        baseMethod.add("setq");
        baseMethod.add("write");
        baseMethod.add("read");
        baseMethod.add("print");
        baseMethod.add("let");
        baseMethod.add("getf");
        baseMethod.add("list");
        baseMethod.add(">");
        baseMethod.add("<");
        baseMethod.add("+");
        baseMethod.add("-");
        baseMethod.add("*");
        baseMethod.add("/");
        return baseMethod;
    }

    public static boolean hasPropertyInParent(Project project, PsiElement element, String property) {
        PsiElement parent = element;
        while(parent != null ) {
            parent = parent.getParent();
            if(parent instanceof LispDefunBlock) {
                List<LispDefunVar> vars = ((LispDefunBlock) parent).getDefunVarList();
                for(LispDefunVar var : vars) {
                    if (property.equals(var.getText())) {
                        return true;
                    }
                }
            } else if(parent instanceof LispLetBlock) {
                List<LispLetVarBlock> vars = ((LispLetBlock) parent).getLetVarBlockList();
                for(LispLetVarBlock var : vars) {
                    if (property.equals(var.getVar().getText())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static List<String> getAllProperty(Project project) {
        List<String> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME,
                LispFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispBlockBody[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
                if(defFunctions != null) {
                    for(LispBlockBody block : defFunctions) {
                        if(block.getSpecialForm() != null) {
                            LispSetqBlock item = block.getSpecialForm().getSetqBlock();
                            if(item != null) {
                                List<String> properties = item.getProperties();
                                for(String property : properties) {
                                    if (result == null) {
                                        result = new ArrayList<String>();
                                    }
                                    result.add(property);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<String>emptyList();
    }

    public static List<String> getMakeOption(Project project) {
        List<String> result = new ArrayList<String>();
        List<String> types = LispLangManager.getInstance().getAllTypeName();
        for(String type : types) {
            result.add("make-"+type);
        }
        List<LispDefStructure> defStructures = findDefStructures(project);
        for(LispDefStructure defStructure : defStructures) {
            String makeType = "make-" + defStructure.getStructNameAndOptions().getStructName().getText();
            if(!result.contains(makeType)) {
                result.add(makeType);
                LispLangManager.getInstance().addType(defStructure.getStructNameAndOptions().getStructName().getText());
            }

        }
        return result;
    }

    public static PsiElement getElementFromIndex(IElementType tokenType, LispFile file) {
        List<PsiElement> elements = findAllElementByType(tokenType, file);
        for (PsiElement element : elements) {
            if(element.getNode().getElementType().getIndex() == tokenType.getIndex()) {
                return element;
            }
        }
        return null;
    }

    private static List<PsiElement> findAllElementByType(IElementType tokenType, LispFile file) {
        Collection<PsiElement> elements = PsiTreeUtil.findChildrenOfType(file, PsiElement.class);
        List<PsiElement> result = new ArrayList<PsiElement>();
        for(PsiElement element : elements) {
            if(element.getNode().getElementType().equals(tokenType)) {
                result.add(element);
            }
        }
        return result;
    }
}
