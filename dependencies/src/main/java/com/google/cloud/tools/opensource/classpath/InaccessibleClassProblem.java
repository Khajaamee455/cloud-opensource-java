/*
 * Copyright 2020 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tools.opensource.classpath;

/**
 * The target class of the symbol reference is inaccessible to the source class.
 *
 * <p>If the source class is in a different package, the class or one of its enclosing types is not
 * public. If the source class is in the same package, the class or one of its enclosing types is
 * private.
 */
class InaccessibleClassProblem extends IncompatibleLinkageProblem {
  InaccessibleClassProblem(ClassFile sourceClass, ClassFile targetClass, Symbol symbol) {
    super("is not accessible", sourceClass, targetClass, symbol);
  }
}
