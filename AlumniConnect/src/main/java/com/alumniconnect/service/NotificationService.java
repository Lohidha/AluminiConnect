package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Notification;

public interface NotificationService {

    Notification addNotification(Notification notification);

    Notification updateNotification(Notification notification);

    void deleteNotification(int notificationId);

    Notification getNotificationById(int notificationId);

    List<Notification> getAllNotifications();

}