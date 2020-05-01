package com.toast.plugin;

import android.widget.Toast;

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
            Toast.makeText(getActivity().getApplicationContext(), value != null ? value : "Toast plugin called", Toast.LENGTH_SHORT).show();
            ret.put("value", "Toast successful");
            call.success(ret);
        } catch (Exception ex) {
            ret.put("error", ex.getMessage());
            call.error("Toast failed", ex);
        }
    }
}
