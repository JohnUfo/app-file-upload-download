package uz.muydinovs.appfileuploaddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.muydinovs.appfileuploaddownload.entitiy.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
