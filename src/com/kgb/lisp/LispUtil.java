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
    public static List<LispDefunBlock> findDefFunctions(LispFile lispFile, String key) {
        List<LispDefunBlock> result = new ArrayList<>();
        if (lispFile != null) {
            LispBlockBody[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
            if (defFunctions != null) {
                for (LispBlockBody block : defFunctions) {
                    ASTNode node = block.getNode().findChildByType(LispTypes.DEFUN_BLOCK);
                    if (node != null) {
                        LispDefunBlock item = (LispDefunBlock) node.getPsi();
                        if (key.equals(item.getFuncName())) {
                            result.add(item);
                        }
                    }
                }
            }
            List<LispLoadBlock> loadBlocks = findAllLoadBlock(lispFile);
            for(LispLoadBlock loadBlock : loadBlocks) {
                VirtualFile file = getFileFromPath(lispFile.getProject(), loadBlock.getFilePath().getText().replace("\"", ""));
                if(file != null) {
                    List<LispDefunBlock> partResult = findDefFunctions((LispFile) PsiManager.getInstance(lispFile.getProject()).findFile(file));
                    if(partResult != null) {
                        result.addAll(partResult);
                    }
                }
            }
        }
        return result;
    }

    public static List<LispDefunBlock> findDefFunctions(LispFile lispFile) {
        List<LispDefunBlock> result = new ArrayList<>();
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
                List<LispLoadBlock> loadBlocks = findAllLoadBlock(lispFile);
                for(LispLoadBlock loadBlock : loadBlocks) {
                    VirtualFile file = getFileFromPath(lispFile.getProject(), loadBlock.getFilePath().getText().replace("\"", ""));
                    if(file != null) {
                        List<LispDefunBlock> partResult = findDefFunctions((LispFile) PsiManager.getInstance(lispFile.getProject()).findFile(file));
                        result.addAll(partResult);
                    }
                }
            }
        return result;
    }

    private static VirtualFile getFileFromPath(Project project, String filePath) {
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, LispFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        System.out.println(filePath);
        for (VirtualFile file : virtualFiles) {
            System.out.println(file.getPath());
            if(file.getPath().equals(filePath)) {
                return file;
            }
        }
        return null;
    }

    private static List<LispLoadBlock> findAllLoadBlock(LispFile lispFile) {
        List<LispLoadBlock> result = new ArrayList<>();
        LispBlockBody[] blocks = PsiTreeUtil.getChildrenOfType(lispFile, LispBlockBody.class);
        if(blocks != null) {
            for (LispBlockBody blockBody : blocks) {
                if (blockBody.getFirstChild() instanceof LispSpecialForm && blockBody.getFirstChild().getFirstChild() instanceof LispLoadBlock) {
                    result.add((LispLoadBlock) blockBody.getFirstChild().getFirstChild());
                }
            }
        }
        return result;
    }

    public static List<LispDefStructure> findDefStructures(Project project) {
        List<LispDefStructure> result = new ArrayList<>();
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
        List<LispDefStructure> result = new ArrayList<>();
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
                                List<LispSetqArgs> properties = item.getSetqArgsList();
                                for(LispSetqArgs property : properties) {
                                    if (key.equals(property.getText())) {
                                        if (result == null) {
                                            result = new ArrayList<>();
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
        return result != null ? result : Collections.emptyList();
    }

    public static List<String> getBaseMethodName() {
        List<String> baseMethod = new ArrayList<>();
        baseMethod.add("defun");
        baseMethod.add("defvar");
        baseMethod.add("defstruct");
        baseMethod.add("dolist");
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
        baseMethod.add("push");
        baseMethod.add("load");
        baseMethod.add("format");
        baseMethod.add(">");
        baseMethod.add("<");
        baseMethod.add("+");
        baseMethod.add("-");
        baseMethod.add("*");
        baseMethod.add("/");
        return baseMethod;
    }

    public static boolean hasPropertyInParent(PsiElement element, String property) {
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
                                List<LispSetqArgs> properties = item.getSetqArgsList();
                                for(LispSetqArgs property : properties) {
                                    if (result == null) {
                                        result = new ArrayList<>();
                                    }
                                    result.add(property.getArg().getStringValue().getText());
                                }
                            }
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.emptyList();
    }

    public static List<String> getMakeOption(Project project) {
        List<String> result = new ArrayList<>();
        List<String> types = LispLangManager.getInstance().getAllTypeName();
        for(String type : types) {
            result.add("make-"+type);
        }
        List<LispDefStructure> defStructures = findDefStructures(project);
        for(LispDefStructure defStructure : defStructures) {
            String makeType = "make-" + defStructure.getStructNameAndOptions().getStructName().getText();
            if(!result.contains(makeType)) {
                result.add(makeType);
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
        List<PsiElement> result = new ArrayList<>();
        for(PsiElement element : elements) {
            if(element.getNode().getElementType().equals(tokenType)) {
                result.add(element);
            }
        }
        return result;
    }

    public static Collection<VirtualFile> getAllLispFiles(Project project) {
        return FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME,
                LispFileType.INSTANCE, GlobalSearchScope.allScope(project));
    }
}
