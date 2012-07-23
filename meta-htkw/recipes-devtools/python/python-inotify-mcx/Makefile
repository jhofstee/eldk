#
# (C) Copyright 2012
# Stefano Babic, DENX Software Engineering, sbabic@denx.de.
#
# See file CREDITS for list of people who contributed to this
# project.
#
# This program is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License as
# published by the Free Software Foundatio; either version 2 of
# the License, or (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place, Suite 330, Boston,
# MA 02111-1307 USA
#
#########################################################################

all: inotify_syscalls.so

LIB: inotify_syscalls.so

C_FLAGS = -pthread -fno-strict-aliasing -DNDEBUG -g -fwrapv -O2 -Wall -Wstrict-prototypes -fpic -fPIC
LIB_FLAGS = -pthread -shared -Wl,-O1 -Wl,-Bsymbolic-functions -Wl,-Bsymbolic-functions -Wl,-z,relro -fpic

inotify_syscalls.o: inotify_syscalls.c
	echo "CFLAGS=$(CFLAGS)"
	$(CC) $(CFLAGS) $(C_FLAGS) -o $@ -c inotify_syscalls.c

inotify_syscalls.so:	inotify_syscalls.o
	$(CC) $(LDFLAGS) $(LIB_FLAGS) -o inotify_syscalls.so inotify_syscalls.o
	
install: $(LIB)
	$(STRIP) $(LIB) --strip-unneeded

clean:
	@rm -f $(LIB)
	@rm -f *.o
