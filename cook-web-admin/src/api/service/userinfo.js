import request from '@/utils/request'

// 查询报名用户列表
export function listUserinfo(query) {
  return request({
    url: '/service/userinfo/list',
    method: 'get',
    params: query
  })
}

// 查询报名用户详细
export function getUserinfo(id) {
  return request({
    url: '/service/userinfo/' + id,
    method: 'get'
  })
}

// 新增报名用户
export function addUserinfo(data) {
  return request({
    url: '/service/userinfo',
    method: 'post',
    data: data
  })
}

// 修改报名用户
export function updateUserinfo(data) {
  return request({
    url: '/service/userinfo',
    method: 'put',
    data: data
  })
}

// 删除报名用户
export function delUserinfo(id) {
  return request({
    url: '/service/userinfo/' + id,
    method: 'delete'
  })
}

// 导出报名用户
export function exportUserinfo(query) {
  return request({
    url: '/service/userinfo/export',
    method: 'get',
    params: query
  })
}