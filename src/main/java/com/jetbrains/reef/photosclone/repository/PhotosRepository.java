package com.jetbrains.reef.photosclone.repository;

import com.jetbrains.reef.photosclone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
}
