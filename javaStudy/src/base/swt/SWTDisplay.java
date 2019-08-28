package base.swt;

import org.eclipse.swt.SWT;  
import org.eclipse.swt.events.SelectionAdapter;  
import org.eclipse.swt.events.SelectionEvent;  
import org.eclipse.swt.graphics.Image;  
import org.eclipse.swt.widgets.Button;  
import org.eclipse.swt.widgets.Display;  
import org.eclipse.swt.widgets.Shell; 

/** 
* @author cornyu 
* @version 创建时间：2018年1月17日 下午4:07:49 
* 类说明 
*/
public class SWTDisplay {

    private static int dialogcnt = 0;   
    // 用于限制子窗口打开次数  
    public static void main(String[] args) {  
          
        // chapter 1: 初始化窗口  
        Display display = new Display();                // 创建 Display 类的实例        
        final Shell shell = new Shell(display);             // 创建该 Display 的 Shell 类实例  
        shell.setText("Hello SWT");                        // 设置窗口标题  
        shell.setSize(300, 200);  
        shell.setImage(new Image(display, "/Users/cornyu/Downloads/javaweb/test/voiceTube@2x.png"));       // 设置父窗口图标  
        //shell.pack();  
        shell.open();  
          
          
          
        // chapter 2: 向 Shell 中添加 Widget, 用于编写当前 Shell 中放置部件的代码  
        Button button = new Button(shell, SWT.CENTER);  // 创建一个按钮  
        button.setText("Hello SWT World!");;            // 设置按钮显示的文字  
        button.pack();  
            // 注册按钮单击事件  
        button.addSelectionListener(new SelectionAdapter() {  
            public void widgetSelected(SelectionEvent event) {  
                if(dialogcnt < 3){  
                    createChildrenShell(shell);             // 创建子窗口  
                    dialogcnt++;  
                }  
                  
            }  
        });  
          
          
        // chapter 3: GUI 调用  
        //shell.pack();                                 // 调整布局(保证[窗口]显示正常/适当/恰好)  
        //shell.open();                                 // 打开窗口  
        while(!shell.isDisposed()) {  
            if(!display.readAndDispatch())  
                display.sleep();  
        }  
          
        // 销毁 Display 实例，释放创建 Display 时获取的内存资源，断开与本地操作系统的连接  
        display.dispose();  
  
    }  
  
    // 创建子窗口  
    protected static Shell createChildrenShell(Shell shell) {  
        Shell dialogShell = new Shell(shell, SWT.CLOSE);  
        dialogShell.setText("对话框");  
        dialogShell.setSize(shell.getSize());  // 设置窗口大小与原窗口相同  
        dialogShell.pack();  
        dialogShell.open();  
        return dialogShell;  
    }  


}
