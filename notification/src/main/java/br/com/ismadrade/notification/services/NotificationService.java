package br.com.ismadrade.notification.services;

import br.com.ismadrade.notification.models.NotificationModel;

public interface NotificationService {
    NotificationModel saveNotification(NotificationModel notificationModel);
}
