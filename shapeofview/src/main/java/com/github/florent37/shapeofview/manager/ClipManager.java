package com.github.florent37.shapeofview.manager;

import android.graphics.Bitmap;
import android.graphics.Path;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ClipManager {

    @NonNull
    Bitmap createMask(int width, int height);

    @Nullable
    Path getShadowConvexPath();

    void setupClipLayout(int width, int height);
}
