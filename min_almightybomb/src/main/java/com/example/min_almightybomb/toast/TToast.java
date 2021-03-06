package com.example.min_almightybomb.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * @author
 * @ClassName: TToast
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date
 */
public class TToast {
    public static TPrompt tPrompt;
    public static TPromptSuccess tPromptSuccess;
    public static TPromptError tPromptError;

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showAnimToast(Context mContext, String msg) {
        if (!isFastDoubleClick()) {
            if (tPrompt == null) {
                tPrompt = new TPrompt(mContext);
            }
            tPrompt.showToast(msg);
        }
    }

    public static void showAnimSuccessToast(Context mContext, String msg) {
        if (!isFastDoubleClick()) {
            if (tPromptSuccess == null) {
                tPromptSuccess = new TPromptSuccess(mContext);
            }
            tPromptSuccess.showToast(msg);
        }
    }

    public static void showAnimErrorToast(Context mContext, String msg) {
        if (!isFastDoubleClick()) {
            if (tPromptError == null) {
                tPromptError = new TPromptError(mContext);
            }
            tPromptError.showToast(msg);
        }
    }

    protected static long lastClickTime;

    protected static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        if (time - lastClickTime < 500) {
            return true;
        }
        lastClickTime = time;
        return false;
    }
}
