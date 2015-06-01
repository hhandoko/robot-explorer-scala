/**
 * File     : Terrain.scala
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

/**
 * The exploration terrain.
 *
 * @param xBound the X boundary coordinate.
 * @param yBound the Y boundary coordinate.
 */
case class Terrain(
  xBound: Int,
  yBound: Int
)

/**
 * The terrain companion object.
 */
object Terrain {

  /**
   * Creates a new instance of Terrain.
   *
   * @return the default Terrain object.
   */
  def apply: Terrain = this(10, 10)

}
