package br.com.ismadrade.notification.services.impl;

import br.com.ismadrade.notification.models.NotificationModel;
import br.com.ismadrade.notification.repositories.NotificationRepository;
import br.com.ismadrade.notification.services.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public NotificationModel saveNotification(NotificationModel notificationModel) {
        return notificationRepository.save(notificationModel);
    }
}
