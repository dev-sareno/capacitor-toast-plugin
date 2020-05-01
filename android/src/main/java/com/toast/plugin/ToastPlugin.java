package com.toast.plugin;

import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class ToastPlugin extends Plugin {

    @PluginMethod()
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();

        try {
            new AlertDialog.Builder(getContext())
                    .setTitle("Native Alert")
                    .setMessage("Receive a call on Native Android.\nvalue: " + value)
                    .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create()
                    .show();

            ret.put("value", "Toast successful");
            call.success(ret);
        } catch (Exception ex) {
            ret.put("error", ex.getMessage());
            call.error("Toast failed", ex);
        }
    }
}
