package com.kgb.lisp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.LispLangManager
 */
public class LispLangManager {

    private static LispLangManager sInstance = new LispLangManager();

    private List<String> mTypes = new ArrayList<String>();

    public static LispLangManager getInstance() {
        return sInstance;
    }
    private LispLangManager() {
        mTypes.add("array");
        mTypes.add("list");
        mTypes.add("hash-table");
    }

    public List<String> getAllTypeName() {
        return mTypes;
    }

    public void addType(String typeName) {
        if(!mTypes.contains(typeName)) {
            mTypes.add(typeName);
        }
    }
}
