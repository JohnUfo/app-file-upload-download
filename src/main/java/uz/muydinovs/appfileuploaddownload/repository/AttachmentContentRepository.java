package uz.muydinovs.appfileuploaddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appfileuploaddownload.entitiy.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
    Optional<AttachmentContent> findByAttachmentId(Integer attachmentId);
}
