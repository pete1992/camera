/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.android.camera.view.settings.executor;

import com.sonyericsson.android.camera.view.settings.SettingController;
import com.sonyericsson.cameracommon.setting.executor.SettingExecutorInterface;
import com.sonyericsson.cameracommon.setting.settingitem.TypedSettingItem;

/*
 * Exception performing whole class analysis.
 */
class CloseExecutor<T>
implements SettingExecutorInterface<T> {
    private final SettingExecutorInterface<T> mExecutor;
    private final SettingController mSettingController;

    public CloseExecutor(SettingController var1, SettingExecutorInterface<T> var2);

    @Override
    public void onExecute(TypedSettingItem<T> var1);
}
