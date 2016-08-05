package net.atomarea.flowx.data;

import android.content.Context;
import android.preference.PreferenceManager;

import java.io.Serializable;

/**
 * Created by Tom on 04.08.2016.
 */
public class Account implements Serializable {

    private String Name;
    private String Status;
    private String XmppAddress;

    public Account(Context context, String XmppAddress, String Status) {
        this.XmppAddress = XmppAddress;
        this.Status = Status;
        reloadName(context);
    }

    public void reloadName(Context context) {
        Name = PreferenceManager.getDefaultSharedPreferences(context).getString("account:" + XmppAddress, XmppAddress);
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getXmppAddress() {
        return XmppAddress;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
