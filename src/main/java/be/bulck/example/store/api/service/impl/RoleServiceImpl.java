/*
 * Copyright (C) 2017 The Store API Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package be.bulck.example.store.api.service.impl;

import be.bulck.example.store.api.domain.security.Role;
import be.bulck.example.store.api.repository.RoleRepository;
import be.bulck.example.store.api.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The service implementation for role entity.
 *
 * @author Fabien Vanden Bulck
 */
@Service
public class RoleServiceImpl implements RoleService {
  @Autowired
  private RoleRepository roleRepository;

  @Override
  public Role findByName(String name) {
    return roleRepository.findOneByName(name);
  }

  @Override
  public Role save(Role role) {
    return roleRepository.save(role);
  }
}
