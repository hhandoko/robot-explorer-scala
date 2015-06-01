/**
 * File     : Robot.scala
 * Author   : Herdy Handoko
 * Created  : 2015/06/01
 * License  :
 *   Copyright (c) 2015 Herdy Handoko
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.hhandoko.robotexplorer

import com.hhandoko.robotexplorer.valuetypes.Direction

/**
 * The robot explorer.
 *
 * @param xPos the current X coordinate.
 * @param yPos the current Y coordinate.
 * @param direction the current direction.
 */
case class Robot(
  xPos: Int,
  yPos: Int,
  direction: Direction
)

/**
 * The robot explorer companion object.
 */
object Robot {

  /**
   * Creates a new instance of Robot.
   *
   * @return the default Robot object.
   */
  def apply: Robot = this(0, 0, Direction.N)

}
