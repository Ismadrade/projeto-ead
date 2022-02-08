package br.com.ismadrade.notification.services.impl;

import br.com.ismadrade.notification.repositories.NotificationRepository;
import br.com.ismadrade.notification.services.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
}
