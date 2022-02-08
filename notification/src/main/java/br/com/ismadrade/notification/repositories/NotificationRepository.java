package br.com.ismadrade.notification.repositories;

import br.com.ismadrade.notification.models.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, UUID> {

//    Page<NotificationModel> findAllByUserIdAndNotificationStatus(UUID userId, NotificationStatus notificationStatus, Pageable pageable);
//
//    Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}