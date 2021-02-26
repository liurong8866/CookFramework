import request from '@/utils/request'

// 查询用户列表
export function listInfo(query) {
  return request({
    url: '/service/info/list',
    method: 'get',
    params: query
  })
}

// 查询用户详细
export function getInfo(id) {
  return request({
    url: '/service/info/' + id,
    method: 'get'
  })
}

// 新增用户
export function addInfo(data) {
  return request({
    url: '/service/info',
    method: 'post',
    data: data
  })
}

// 修改用户
export function updateInfo(data) {
  return request({
    url: '/service/info',
    method: 'put',
    data: data
  })
}

// 删除用户
export function delInfo(id) {
  return request({
    url: '/service/info/' + id,
    method: 'delete'
  })
}

// 导出用户
export function exportInfo(query) {
  return request({
    url: '/service/info/export',
    method: 'get',
    params: query
  })
}