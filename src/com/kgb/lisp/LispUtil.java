package com.kgb.lisp;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.kgb.lisp.psi.LispCallFunc;
import com.kgb.lisp.psi.LispDefFunItem;
import com.kgb.lisp.psi.LispFile;
import com.kgb.lisp.psi.LispSetqBlock;
import com.kgb.lisp.psi.impl.LispDefFunItemImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.LispUtil
 */
public class LispUtil {
    public static List<LispDefFunItem> findDefFunctions(Project project, String key) {
        List<LispDefFunItem> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME,
                LispFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for(VirtualFile virtualFile : virtualFiles) {
            LispFile lispFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if(lispFile != null) {
                LispDefFunItem[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispDefFunItem.class);
                if(defFunctions != null) {
                    for(LispDefFunItem item : defFunctions) {
                        if(key.equals(item.getFunctionName())) {
                            if(result == null) {
                                result = new ArrayList<LispDefFunItem>();
                            }
                            result.add(item);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<LispDefFunItem>emptyList();
    }

    public static List<LispDefFunItem> findDefFunctions(Project project) {
        List<LispDefFunItem> result = new ArrayList<LispDefFunItem>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, LispFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            LispFile simpleFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                LispDefFunItem[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, LispDefFunItem.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
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
                LispSetqBlock[] defFunctions = PsiTreeUtil.getChildrenOfType(lispFile, LispSetqBlock.class);
                if(defFunctions != null) {
                    for(LispSetqBlock item : defFunctions) {
                        if(key.equals(item.getProperty())) {
                            if(result == null) {
                                result = new ArrayList<LispSetqBlock>();
                            }
                            result.add(item);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<LispSetqBlock>emptyList();
    }

    public static List<LispSetqBlock> findProperties(Project project) {
        List<LispSetqBlock> result = new ArrayList<LispSetqBlock>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, LispFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            LispFile simpleFile = (LispFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                LispSetqBlock[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, LispSetqBlock.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

    public static List<String> getBaseMethodName() {
        List<String> baseMethod = new ArrayList<String>();
        baseMethod.add("defun");
        baseMethod.add("if");
        baseMethod.add("car");
        baseMethod.add("cdr");
        baseMethod.add("loop");
        baseMethod.add("cons");
        baseMethod.add("setq");
        baseMethod.add("write");
        baseMethod.add("print");
        baseMethod.add("let");
        baseMethod.add(">");
        baseMethod.add("<");
        baseMethod.add("+");
        baseMethod.add("-");
        baseMethod.add("*");
        baseMethod.add("/");
        return baseMethod;
    }
}
