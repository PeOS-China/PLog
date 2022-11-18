package com.wyh.plog.upload;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.List;

public interface UploadListener {

    void upload(@NonNull final List<File> file);

}
