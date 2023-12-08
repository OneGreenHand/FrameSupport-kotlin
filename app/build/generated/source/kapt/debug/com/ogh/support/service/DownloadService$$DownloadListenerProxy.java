package com.ogh.support.service;

import com.arialyy.aria.core.scheduler.AptNormalTaskListener;
import com.arialyy.aria.core.task.DownloadTask;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;

/**
 * 该文件为Aria自动生成的代理文件，请不要修改该文件的任何代码！
 */
public final class DownloadService$$DownloadListenerProxy extends AptNormalTaskListener<DownloadTask> {
  private DownloadService obj;

  public DownloadService$$DownloadListenerProxy() {
  }

  @Override
  public void onPre(final DownloadTask task) {
    obj.onTaskPre((DownloadTask)task);
  }

  @Override
  public void onTaskFail(final DownloadTask task, Exception e) {
    obj.onTaskFail((DownloadTask)task);
  }

  @Override
  public void onTaskComplete(final DownloadTask task) {
    obj.onTaskComplete((DownloadTask)task);
  }

  @Override
  public void onTaskCancel(final DownloadTask task) {
    obj.onTaskCancel((DownloadTask)task);
  }

  @Override
  public void onTaskRunning(final DownloadTask task) {
    obj.onTaskRunning((DownloadTask)task);
  }

  @Override
  public void setListener(final Object obj) {
    this.obj = (DownloadService)obj;
  }
}
