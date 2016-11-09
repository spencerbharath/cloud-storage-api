package com.cloud.storage.interfaces;

import com.cloud.storage.objects.BaseStorageObject;

public interface BaseService {
	
	boolean putObject(BaseStorageObject baseStorageObject);
	boolean deleteObject(BaseStorageObject baseStorageObject);
	byte[] getObject(BaseStorageObject baseStorageObject);

}
