/*
 * ioGame
 * Copyright (C) 2021 - present  渔民小镇 （262610965@qq.com、luoyizhu@gmail.com） . All Rights Reserved.
 * # iohao.com . 渔民小镇
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.iohao.game.common.kit;

import lombok.experimental.UtilityClass;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author 渔民小镇
 * @date 2023-06-01
 */
@UtilityClass
public class PresentKit {

    /**
     * 如果属性为 null，则执行给定操作，否则不执行任何操作。
     *
     * @param obj      属性
     * @param runnable 给定操作
     */
    public void ifNull(Object obj, Runnable runnable) {
        if (Objects.isNull(obj)) {
            runnable.run();
        }
    }

    /**
     * 如果属性不为 null，则执行给定操作，否则不执行任何操作。
     *
     * @param obj    属性
     * @param action 给定操作
     * @since 21.8
     */
    public <T> void ifPresent(T obj, Consumer<T> action) {
        if (Objects.nonNull(obj)) {
            action.accept(obj);
        }
    }
}
