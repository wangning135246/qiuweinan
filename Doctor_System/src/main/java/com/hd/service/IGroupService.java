package com.hd.service;

import com.hd.entity.response.GroupResponse;

public interface IGroupService {

    GroupResponse selectGroup();

    int deleteGroup(int id);
}
