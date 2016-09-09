import com.intellij.notification.impl.NotificationActionProvider;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.Navigatable;
import com.intellij.psi.PsiDirectory;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.intellij.notification.impl.NotificationActionProvider.*;

/**
 * Created by Jan on 17.04.2016.
 */
public class LispNewFileAction extends AnAction {

    private JTextField comp;

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        DialogBuilder builder = new DialogBuilder();
        builder.addOkAction();
        builder.addCancelAction();
        builder.setOkOperation(new Runnable() {
            @Override
            public void run() {
                VirtualFile directory = e.getData(CommonDataKeys.VIRTUAL_FILE);
                File newFile = new File(directory.getCanonicalPath() + "/" + comp.getText() + ".lisp");
                try {
                    if(newFile.exists()) {

                    } else {
                        newFile.createNewFile();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                System.out.println(directory.getCanonicalPath());
            }
        });
        builder.setTitle("New lisp file");
        builder.setCenterPanel(getView());
        builder.show();
    }

    private JComponent getView() {
        JPanel jPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2,0);
        jPanel.setLayout(gridLayout);
        jPanel.add(new JLabel("Enter new lisp file name"));
        comp = new JTextField();
        jPanel.add(comp);
        return jPanel;

    }



}
